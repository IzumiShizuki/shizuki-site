package vg;

import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import jc.l;
import lh.f;
import lh.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22966a = 0;

    static {
        Charset charset = ef.a.f6541a;
    }

    public static ArrayList a(String str, i iVar) throws EOFException, UnknownHostException {
        l.e(str, "hostname");
        l.e(iVar, "byteString");
        ArrayList arrayList = new ArrayList();
        f fVar = new f();
        fVar.X(iVar);
        fVar.readShort();
        short s10 = fVar.readShort();
        if (((s10 & 65535) >> 15) == 0) {
            throw new IllegalArgumentException("not a response");
        }
        int i10 = s10 & 15;
        if (i10 == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i10 == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int i11 = fVar.readShort() & 65535;
        int i12 = fVar.readShort() & 65535;
        fVar.readShort();
        fVar.readShort();
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = fVar.readByte();
            if (b10 < 0) {
                fVar.skip(1L);
            } else {
                while (b10 > 0) {
                    fVar.skip(b10);
                    b10 = fVar.readByte();
                }
            }
            fVar.readShort();
            fVar.readShort();
        }
        for (int i14 = 0; i14 < i12; i14++) {
            byte b11 = fVar.readByte();
            if (b11 < 0) {
                fVar.skip(1L);
            } else {
                while (b11 > 0) {
                    fVar.skip(b11);
                    b11 = fVar.readByte();
                }
            }
            int i15 = fVar.readShort() & 65535;
            fVar.readShort();
            fVar.readInt();
            int i16 = fVar.readShort() & 65535;
            if (i15 == 1 || i15 == 28) {
                byte[] bArr = new byte[i16];
                fVar.read(bArr, 0, i16);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                l.d(byAddress, "getByAddress(...)");
                arrayList.add(byAddress);
            } else {
                fVar.skip(i16);
            }
        }
        return arrayList;
    }
}
