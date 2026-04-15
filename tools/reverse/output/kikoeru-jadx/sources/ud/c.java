package ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f21573d;

    static {
        c cVar = new c("PROPERTY", 0);
        f21570a = cVar;
        c cVar2 = new c("BACKING_FIELD", 1);
        f21571b = cVar2;
        c cVar3 = new c("DELEGATE_FIELD", 2);
        f21572c = cVar3;
        f21573d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f21573d.clone();
    }
}
