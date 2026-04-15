package kb;

import eb.z;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11320b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f11321a;

    public d(z zVar) {
        this.f11321a = zVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) {
        Date date = (Date) this.f11321a.a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) {
        this.f11321a.b(bVar, (Timestamp) obj);
    }
}
