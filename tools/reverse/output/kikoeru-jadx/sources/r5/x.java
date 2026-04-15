package r5;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements o6.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.s f18893a;

    public x(int i10) {
        switch (i10) {
            case 1:
                this.f18893a = new p4.s();
                break;
            default:
                this.f18893a = new p4.s(10);
                break;
        }
    }

    @Override // o6.l
    public /* synthetic */ o6.d f(byte[] bArr, int i10, int i11) {
        return j2.h0.a(this, bArr, i11);
    }

    @Override // o6.l
    public int u() {
        return 2;
    }

    @Override // o6.l
    public void w(byte[] bArr, int i10, int i11, o6.k kVar, p4.g gVar) {
        o4.b bVarA;
        p4.s sVar = this.f18893a;
        sVar.E(bArr, i10 + i11);
        sVar.G(i10);
        ArrayList arrayList = new ArrayList();
        while (sVar.a() > 0) {
            p4.c.b("Incomplete Mp4Webvtt Top Level box header found.", sVar.a() >= 8);
            int iG = sVar.g();
            if (sVar.g() == 1987343459) {
                int i12 = iG - 8;
                CharSequence charSequenceF = null;
                o4.a aVarA = null;
                while (i12 > 0) {
                    p4.c.b("Incomplete vtt cue box header found.", i12 >= 8);
                    int iG2 = sVar.g();
                    int iG3 = sVar.g();
                    int i13 = iG2 - 8;
                    byte[] bArr2 = sVar.f16611a;
                    int i14 = sVar.f16612b;
                    int i15 = p4.c0.f16548a;
                    String str = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    sVar.H(i13);
                    i12 = (i12 - 8) - i13;
                    if (iG3 == 1937011815) {
                        x6.g gVar2 = new x6.g();
                        x6.h.e(str, gVar2);
                        aVarA = gVar2.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = x6.h.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.f16171a = charSequenceF;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = x6.h.f24826a;
                    x6.g gVar3 = new x6.g();
                    gVar3.f24817c = charSequenceF;
                    bVarA = gVar3.a().a();
                }
                arrayList.add(bVarA);
            } else {
                sVar.H(iG - 8);
            }
        }
        gVar.accept(new o6.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // o6.l
    public /* synthetic */ void reset() {
    }
}
