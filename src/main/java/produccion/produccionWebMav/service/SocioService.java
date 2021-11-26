package produccion.produccionWebMav.service;

import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;
import org.springframework.stereotype.Service;
import produccion.produccionWebMav.dto.SocioDto;
import produccion.produccionWebMav.entity.Socio;
import produccion.produccionWebMav.repository.SocioRepository;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Optional;

@Service
public class SocioService {

    private final SocioRepository socioRepository;
    private final Storage storage;

    private final String BUCKED = "business_bucket";
    private final String projectId = "business-cloud-storage";

    public SocioService(SocioRepository socioRepository) {
        this.socioRepository = socioRepository;

        Credentials credentials = null;
        try {
            credentials = GoogleCredentials
                    .fromStream(new FileInputStream("src/main/resources/auth/credGoogle.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.storage = StorageOptions.newBuilder()
                .setCredentials(credentials)
                .setProjectId(projectId)
                .build()
                .getService();


        //this.storage = StorageOptions.getDefaultInstance().getService();
    }

    public Integer createSocio(SocioDto dto){

        /*try {
            String content = imageEncoderDecoder();

            dto.setContentImage(content);

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        String url = saveBucket(dto);

        final Socio socio = new Socio();

        socio.setCelular(dto.getCelular());
        socio.setFechaNac(dto.getFechaNac());
        socio.setNombre(dto.getNombre());
        socio.setTelefono(dto.getTelefono());
        socio.setUrlImage(url);
        socio.setRegistrarIngreso(dto.isRegistrarIngreso());

        socioRepository.save(socio);

        return socio.getSocId();

    }

    public Socio findById(Integer id){

        Optional<Socio> optionalSocio = socioRepository.findById(id);

        return optionalSocio.orElse(null);

    }

    private String saveBucket(SocioDto dto){

        BlobId id = BlobId.of(BUCKED, dto.getNombre());
        BlobInfo info = BlobInfo.newBuilder(id).build();

        byte[] decode = Base64.getDecoder().decode(dto.getContentImage());

        return storage.create(info, decode).getMediaLink();

    }

    private String imageEncoderDecoder() throws IOException {

        // image path declaration
        String imgPath = "src/main/resources/image/star.jpg";

        // read image from file
        FileInputStream stream = new FileInputStream(imgPath);

        // get byte array from image stream
        int bufLength = 2048;
        byte[] buffer = new byte[2048];
        byte[] data;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int readLength;
        while ((readLength = stream.read(buffer, 0, bufLength)) != -1) {
            out.write(buffer, 0, readLength);
        }

        data = out.toByteArray();
        String imageString = Base64.getEncoder().withoutPadding().encodeToString(data);

        out.close();
        stream.close();
        System.out.println("Encode Image Result : " + imageString);

        return imageString;
    }

}
