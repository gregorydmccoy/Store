import java.security.Provider;
import java.util.List;
import java.util.Map;

public class Index extends Provider.Service {

    public Index(
            Provider provider,
            String type,
            String algorithm,
            String className,
            List<String> aliases,
            Map<String, String> attributes) {
        super(provider, type, algorithm, className, aliases, attributes);
    }

    public static void main(String[] args) {



    }

}
