package e7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6309c;

    public int a() {
        int i10 = this.f6309c;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.f6307a) {
            case 3:
                StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
                sb.append(0);
                sb.append(", mCurrentPosition=");
                sb.append(0);
                sb.append(", mItemDirection=");
                sb.append(0);
                sb.append(", mLayoutDirection=");
                sb.append(0);
                sb.append(", mStartLine=");
                sb.append(this.f6308b);
                sb.append(", mEndLine=");
                return j2.h0.m(sb, this.f6309c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c0(int i10, int i11, int i12) {
        this.f6307a = i12;
        this.f6308b = i10;
        this.f6309c = i11;
    }
}
