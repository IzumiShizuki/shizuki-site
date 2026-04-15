package e6;

import gh.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.n0;
import ud.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f6286d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f6287b = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f6288c = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // gh.g
    public final n0 t(a6.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f6288c;
        CharsetDecoder charsetDecoder2 = this.f6287b;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new n0(new c(null, null, bArr));
        }
        Matcher matcher = f6286d.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strC0 = e.c0(strGroup);
                strC0.getClass();
                if (strC0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strC0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new n0(new c(str, str2, bArr));
    }
}
