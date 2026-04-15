package x4;

import com.tencent.bugly.beta.tinker.TinkerReport;
import m4.d1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.y f24613b;

    public /* synthetic */ g(p5.y yVar, int i10, long j10, long j11) {
        this.f24612a = 8;
        this.f24613b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24612a;
        int i11 = 16;
        p5.y yVar = this.f24613b;
        switch (i10) {
            case 0:
                v4.s sVar = yVar.f16768c;
                int i12 = c0.f16548a;
                w4.d dVar = sVar.f22626a.f22689s;
                dVar.a0(dVar.Z(), 1029, new w4.b(7));
                break;
            case 1:
                v4.s sVar2 = yVar.f16768c;
                int i13 = c0.f16548a;
                w4.d dVar2 = sVar2.f22626a.f22689s;
                dVar2.a0(dVar2.Z(), 1031, new w4.c(i11));
                break;
            case 2:
                v4.s sVar3 = yVar.f16768c;
                int i14 = c0.f16548a;
                w4.d dVar3 = sVar3.f22626a.f22689s;
                dVar3.a0(dVar3.Z(), 1008, new d1(26));
                break;
            case 3:
                v4.s sVar4 = yVar.f16768c;
                int i15 = c0.f16548a;
                w4.d dVar4 = sVar4.f22626a.f22689s;
                dVar4.a0(dVar4.Z(), 1012, new w4.c(8));
                break;
            case 4:
                v4.s sVar5 = yVar.f16768c;
                int i16 = c0.f16548a;
                w4.d dVar5 = sVar5.f22626a.f22689s;
                dVar5.a0(dVar5.Z(), 1007, new w4.b(13));
                break;
            case 5:
                v4.s sVar6 = yVar.f16768c;
                int i17 = c0.f16548a;
                w4.d dVar6 = sVar6.f22626a.f22689s;
                dVar6.a0(dVar6.Z(), 1014, new w4.c(5));
                break;
            case 6:
                v4.s sVar7 = yVar.f16768c;
                int i18 = c0.f16548a;
                w4.d dVar7 = sVar7.f22626a.f22689s;
                dVar7.a0(dVar7.Z(), 1009, new w4.c(0));
                break;
            case 7:
                v4.s sVar8 = yVar.f16768c;
                int i19 = c0.f16548a;
                w4.d dVar8 = sVar8.f22626a.f22689s;
                dVar8.a0(dVar8.Z(), 1010, new w4.b(16));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                v4.s sVar9 = yVar.f16768c;
                int i20 = c0.f16548a;
                w4.d dVar9 = sVar9.f22626a.f22689s;
                dVar9.a0(dVar9.Z(), 1011, new w4.c(11));
                break;
            default:
                v4.s sVar10 = yVar.f16768c;
                int i21 = c0.f16548a;
                w4.d dVar10 = sVar10.f22626a.f22689s;
                dVar10.a0(dVar10.Z(), 1032, new w4.c(14));
                break;
        }
    }

    public /* synthetic */ g(p5.y yVar, long j10) {
        this.f24612a = 7;
        this.f24613b = yVar;
    }

    public /* synthetic */ g(p5.y yVar, Object obj, int i10) {
        this.f24612a = i10;
        this.f24613b = yVar;
    }

    public /* synthetic */ g(p5.y yVar, String str, long j10, long j11) {
        this.f24612a = 2;
        this.f24613b = yVar;
    }

    public /* synthetic */ g(p5.y yVar, m4.q qVar, v4.g gVar) {
        this.f24612a = 6;
        this.f24613b = yVar;
    }
}
