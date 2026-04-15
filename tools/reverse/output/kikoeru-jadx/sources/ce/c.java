package ce;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements y {
    static {
        int i10 = i.f3941b;
    }

    public static void b(b bVar) throws s {
        if (bVar == null || bVar.b()) {
            return;
        }
        s sVar = new s(new j0().getMessage());
        sVar.f3972a = bVar;
        throw sVar;
    }

    public final b c(ByteArrayInputStream byteArrayInputStream, i iVar) throws s {
        b bVar;
        try {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                bVar = null;
            } else {
                if ((i10 & 128) != 0) {
                    i10 &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 >= 32) {
                            while (i11 < 64) {
                                int i12 = byteArrayInputStream.read();
                                if (i12 == -1) {
                                    throw s.b();
                                }
                                if ((i12 & 128) != 0) {
                                    i11 += 7;
                                }
                            }
                            throw new s("CodedInputStream encountered a malformed varint.");
                        }
                        int i13 = byteArrayInputStream.read();
                        if (i13 == -1) {
                            throw s.b();
                        }
                        i10 |= (i13 & 127) << i11;
                        if ((i13 & 128) == 0) {
                            break;
                        }
                        i11 += 7;
                    }
                }
                f fVar = new f(new a(byteArrayInputStream, i10));
                b bVar2 = (b) a(fVar, iVar);
                try {
                    fVar.a(0);
                    bVar = bVar2;
                } catch (s e10) {
                    e10.f3972a = bVar2;
                    throw e10;
                }
            }
            b(bVar);
            return bVar;
        } catch (IOException e11) {
            throw new s(e11.getMessage());
        }
    }
}
