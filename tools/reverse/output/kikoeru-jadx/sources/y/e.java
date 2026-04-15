package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25115b;

    public e(int i10) {
        this.f25114a = i10;
        switch (i10) {
            case 1:
                this.f25115b = 0;
                break;
            case 2:
                this.f25115b = 0;
                break;
            case 3:
                this.f25115b = 0;
                break;
            default:
                this.f25115b = 0;
                break;
        }
    }

    @Override // y.f, y.h
    public final float a() {
        switch (this.f25114a) {
        }
        return this.f25115b;
    }

    @Override // y.f
    public final void b(f3.c cVar, int i10, int[] iArr, f3.m mVar, int[] iArr2) {
        switch (this.f25114a) {
            case 0:
                if (mVar != f3.m.f6667a) {
                    k.a(i10, iArr, iArr2, true);
                } else {
                    k.a(i10, iArr, iArr2, false);
                }
                break;
            case 1:
                if (mVar != f3.m.f6667a) {
                    k.d(i10, iArr, iArr2, true);
                } else {
                    k.d(i10, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != f3.m.f6667a) {
                    k.e(i10, iArr, iArr2, true);
                } else {
                    k.e(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != f3.m.f6667a) {
                    k.f(i10, iArr, iArr2, true);
                } else {
                    k.f(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // y.h
    public final void c(f3.c cVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f25114a) {
            case 0:
                k.a(i10, iArr, iArr2, false);
                break;
            case 1:
                k.d(i10, iArr, iArr2, false);
                break;
            case 2:
                k.e(i10, iArr, iArr2, false);
                break;
            default:
                k.f(i10, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f25114a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
