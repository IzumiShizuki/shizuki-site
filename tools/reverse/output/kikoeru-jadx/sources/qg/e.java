package qg;

import i7.p2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, rg.f fVar, char[] cArr, int i10, boolean z10, int i11) {
        super(jVar, fVar, cArr, i10, z10);
        this.f18278e = i11;
    }

    @Override // qg.b
    public final lg.b g(rg.f fVar, char[] cArr, boolean z10) throws IOException {
        byte bA;
        switch (this.f18278e) {
            case 0:
                return new m3.l(28);
            default:
                long j10 = fVar.f19040r;
                long j11 = fVar.f19039q;
                byte[] bArr = new byte[12];
                i(bArr);
                p2 p2Var = new p2();
                ng.b bVar = new ng.b();
                p2Var.f9258a = bVar;
                if (cArr == null || cArr.length <= 0) {
                    throw new og.a("Wrong password!");
                }
                int[] iArr = bVar.f15877a;
                int i10 = 0;
                iArr[0] = 305419896;
                iArr[1] = 591751049;
                iArr[2] = 878082192;
                for (byte b10 : n7.d.g(cArr, z10)) {
                    bVar.b((byte) (b10 & 255));
                }
                byte b11 = bArr[0];
                while (i10 < 12) {
                    i10++;
                    if (i10 == 12 && (bA = (byte) (bVar.a() ^ b11)) != ((byte) (j10 >> 24)) && bA != ((byte) (j11 >> 8))) {
                        throw new og.a("Wrong password!");
                    }
                    bVar.b((byte) (bVar.a() ^ b11));
                    if (i10 != 12) {
                        b11 = bArr[i10];
                    }
                }
                return p2Var;
        }
    }
}
