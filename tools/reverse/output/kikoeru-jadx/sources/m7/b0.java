package m7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14833e;

    public final int a() {
        if (this.f14831c) {
            return 0 - this.f14829a;
        }
        return 0;
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=0, mDeletedInvisibleItemCountSincePreviousLayout=" + this.f14829a + ", mStructureChanged=" + this.f14830b + ", mInPreLayout=" + this.f14831c + ", mRunSimpleAnimations=" + this.f14832d + ", mRunPredictiveAnimations=" + this.f14833e + '}';
    }
}
