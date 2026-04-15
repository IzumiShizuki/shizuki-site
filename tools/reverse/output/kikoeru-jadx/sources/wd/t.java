package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum t implements ce.q {
    f23942b("AT_MOST_ONCE"),
    f23943c("EXACTLY_ONCE"),
    f23944d("AT_LEAST_ONCE");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23946a;

    t(String str) {
        this.f23946a = i;
    }

    @Override // ce.q
    public final int a() {
        return this.f23946a;
    }
}
