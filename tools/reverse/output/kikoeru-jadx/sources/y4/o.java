package y4;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.f f25543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f25544b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z4.c f25548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25551i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f25547e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f25546d = c0.n(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6.b f25545c = new b6.b(1);

    public o(z4.c cVar, d dVar, n5.f fVar) {
        this.f25548f = cVar;
        this.f25544b = dVar;
        this.f25543a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f25551i) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f25536a;
            long j11 = mVar.f25537b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f25547e;
            Long l10 = (Long) treeMap.get(lValueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
