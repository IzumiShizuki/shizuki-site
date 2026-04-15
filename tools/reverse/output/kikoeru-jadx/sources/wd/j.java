package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum j implements ce.q {
    f23770b("CLASS"),
    f23771c("INTERFACE"),
    f23772d("ENUM_CLASS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("ENUM_ENTRY"),
    f23773e("ANNOTATION_CLASS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("OBJECT"),
    f23774f("COMPANION_OBJECT");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23776a;

    j(String str) {
        this.f23776a = i;
    }

    @Override // ce.q
    public final int a() {
        return this.f23776a;
    }
}
