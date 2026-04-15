package fc;

import a2.c;
import ef.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import jc.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {
    public static String h0(File file) throws IOException {
        Charset charset = ef.a.f6541a;
        l.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strV = android.support.v4.media.session.b.V(inputStreamReader);
            inputStreamReader.close();
            return strV;
        } finally {
        }
    }

    public static File i0(File file, String str) {
        int length;
        int iV0;
        File file2 = new File(str);
        String path = file2.getPath();
        l.d(path, "getPath(...)");
        char c3 = File.separatorChar;
        int iV02 = n.v0(path, c3, 0, 4);
        if (iV02 != 0) {
            length = (iV02 <= 0 || path.charAt(iV02 + (-1)) != ':') ? (iV02 == -1 && n.q0(':', path)) ? path.length() : 0 : iV02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c3 || (iV0 = n.v0(path, c3, 2, 4)) < 0) {
            length = 1;
        } else {
            int iV03 = n.v0(path, c3, iV0 + 1, 4);
            length = iV03 >= 0 ? iV03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        l.d(string, "toString(...)");
        if ((string.length() == 0) || n.q0(c3, string)) {
            return new File(string + file2);
        }
        return new File(string + c3 + file2);
    }
}
