package p5;

import j5.d0;
import m4.d1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f16762b;

    public /* synthetic */ w(y yVar, int i10, long j10) {
        this.f16761a = 3;
        this.f16762b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16761a;
        y yVar = this.f16762b;
        switch (i10) {
            case 0:
                v4.s sVar = yVar.f16768c;
                int i11 = c0.f16548a;
                w4.d dVar = sVar.f22626a.f22689s;
                dVar.a0(dVar.Z(), 1016, new w4.b(8));
                break;
            case 1:
                v4.s sVar2 = yVar.f16768c;
                int i12 = c0.f16548a;
                w4.d dVar2 = sVar2.f22626a.f22689s;
                dVar2.a0(dVar2.Z(), 1030, new w4.c(20));
                break;
            case 2:
                v4.s sVar3 = yVar.f16768c;
                int i13 = c0.f16548a;
                w4.d dVar3 = sVar3.f22626a.f22689s;
                dVar3.a0(dVar3.Z(), 1019, new d1(28));
                break;
            case 3:
                v4.s sVar4 = yVar.f16768c;
                int i14 = c0.f16548a;
                w4.d dVar4 = sVar4.f22626a.f22689s;
                dVar4.a0(dVar4.W((d0) dVar4.f23352d.f1654f), 1018, new w4.b(17));
                break;
            case 4:
                v4.s sVar5 = yVar.f16768c;
                int i15 = c0.f16548a;
                w4.d dVar5 = sVar5.f22626a.f22689s;
                dVar5.a0(dVar5.W((d0) dVar5.f23352d.f1654f), 1021, new w4.b(20));
                break;
            case 5:
                v4.s sVar6 = yVar.f16768c;
                int i16 = c0.f16548a;
                w4.d dVar6 = sVar6.f22626a.f22689s;
                dVar6.a0(dVar6.Z(), 1015, new w4.c(1));
                break;
            default:
                v4.s sVar7 = yVar.f16768c;
                int i17 = c0.f16548a;
                w4.d dVar7 = sVar7.f22626a.f22689s;
                dVar7.a0(dVar7.Z(), 1017, new w4.b(27));
                break;
        }
    }

    public /* synthetic */ w(y yVar, long j10, int i10) {
        this.f16761a = 4;
        this.f16762b = yVar;
    }

    public /* synthetic */ w(y yVar, Object obj, int i10) {
        this.f16761a = i10;
        this.f16762b = yVar;
    }

    public /* synthetic */ w(y yVar, String str, long j10, long j11) {
        this.f16761a = 0;
        this.f16762b = yVar;
    }

    public /* synthetic */ w(y yVar, m4.q qVar, v4.g gVar) {
        this.f16761a = 6;
        this.f16762b = yVar;
    }
}
