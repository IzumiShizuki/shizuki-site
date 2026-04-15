package ya;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26004c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f26002a = obj;
        this.f26003b = obj2;
        this.f26004c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f26002a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f26003b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f26004c);
        return new IllegalArgumentException(sb.toString());
    }
}
