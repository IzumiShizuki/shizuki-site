package ug;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum y {
    f21934c("http/1.0"),
    f21935d("http/1.1"),
    f21936e("spdy/3.1"),
    f21937f("h2"),
    f21938g("h2_prior_knowledge"),
    f21939h("quic"),
    f21940i("h3");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21933b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21942a;

    y(String str) {
        this.f21942a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21942a;
    }
}
