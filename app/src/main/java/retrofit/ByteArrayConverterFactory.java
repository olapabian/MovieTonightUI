package retrofit;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class ByteArrayConverterFactory extends Converter.Factory {
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(@NonNull Type type, @NonNull Annotation[] annotations, @NonNull Retrofit retrofit) {
        if (type == byte[].class) {
            return new ByteArrayResponseBodyConverter();
        }
        return null;
    }

    private static final class ByteArrayResponseBodyConverter implements Converter<ResponseBody, byte[]> {
        @Override
        public byte[] convert(ResponseBody value) throws IOException {
            return value.bytes();
        }
    }
}


