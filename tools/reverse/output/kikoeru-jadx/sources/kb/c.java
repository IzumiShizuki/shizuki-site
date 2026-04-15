package kb;

import eb.a0;
import eb.m;
import eb.z;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c implements a0 {
    @Override // eb.a0
    public final z a(m mVar, lb.a aVar) {
        if (aVar.f12165a != Timestamp.class) {
            return null;
        }
        mVar.getClass();
        return new d(mVar.c(new lb.a(Date.class)));
    }
}
