package c4;

import b0.w1;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3410d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f3412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f3413c = 0;

    public w(w1 w1Var, int i10) {
        this.f3412b = w1Var;
        this.f3411a = i10;
    }

    public final int a(int i10) {
        d4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f5473d;
        int i11 = iA + aVarB.f5470a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final d4.a b() {
        ThreadLocal threadLocal = f3410d;
        d4.a aVar = (d4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new d4.a();
            threadLocal.set(aVar);
        }
        d4.b bVar = (d4.b) this.f3412b.f1395c;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f5470a;
            int i11 = (this.f3411a * 4) + ((ByteBuffer) bVar.f5473d).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f5473d).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f5473d;
            aVar.f5473d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f5470a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f5471b = i13;
                aVar.f5472c = ((ByteBuffer) aVar.f5473d).getShort(i13);
                return aVar;
            }
            aVar.f5470a = 0;
            aVar.f5471b = 0;
            aVar.f5472c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        d4.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f5473d).getInt(iA + aVarB.f5470a) : 0));
        sb.append(", codepoints:");
        d4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f5470a;
            i10 = ((ByteBuffer) aVarB2.f5473d).getInt(((ByteBuffer) aVarB2.f5473d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
