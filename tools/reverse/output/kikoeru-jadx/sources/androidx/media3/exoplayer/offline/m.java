package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.cnl.kikoeru.MainApplication;
import da.e0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i5.c f930m = new i5.c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i5.f f942l;
    private final CopyOnWriteArraySet<k> listeners;

    public m(MainApplication mainApplication, r4.b bVar, t4.y yVar, i9.e eVar, ExecutorService executorService) {
        b bVar2 = new b(bVar);
        t4.e eVar2 = new t4.e();
        eVar2.f20418a = yVar;
        eVar2.f20422e = eVar;
        c cVar = new c(eVar2, executorService);
        this.f931a = mainApplication.getApplicationContext();
        this.f932b = bVar2;
        this.f938h = true;
        this.f941k = Collections.EMPTY_LIST;
        this.listeners = new CopyOnWriteArraySet<>();
        int i10 = 0;
        Handler handlerO = c0.o(new f(i10, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        j jVar = new j(handlerThread, bVar2, cVar, handlerO, this.f938h);
        this.f933c = jVar;
        g gVar = new g(i10, this);
        this.f934d = gVar;
        i5.f fVar = new i5.f(mainApplication, gVar, f930m);
        this.f942l = fVar;
        int iB = fVar.b();
        this.f939i = iB;
        this.f935e = 1;
        jVar.obtainMessage(1, iB, 0).sendToTarget();
    }

    public static void a(m mVar, Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            List list = (List) message.obj;
            mVar.f937g = true;
            mVar.f941k = Collections.unmodifiableList(list);
            boolean zG = mVar.g();
            Iterator<k> it = mVar.listeners.iterator();
            while (it.hasNext()) {
                it.next().g(mVar);
            }
            if (zG) {
                mVar.c();
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = mVar.f935e - i11;
            mVar.f935e = i13;
            mVar.f936f = i12;
            if (i12 == 0 && i13 == 0) {
                Iterator<k> it2 = mVar.listeners.iterator();
                while (it2.hasNext()) {
                    it2.next().d(mVar);
                }
                return;
            }
            return;
        }
        if (i10 != 3) {
            throw new IllegalStateException();
        }
        h hVar = (h) message.obj;
        mVar.f941k = Collections.unmodifiableList(hVar.f906c);
        d dVar = hVar.f904a;
        boolean zG2 = mVar.g();
        if (hVar.f905b) {
            Iterator<k> it3 = mVar.listeners.iterator();
            while (it3.hasNext()) {
                it3.next().c(mVar, dVar);
            }
        } else {
            Iterator<k> it4 = mVar.listeners.iterator();
            while (it4.hasNext()) {
                it4.next().e(mVar, dVar, hVar.f907d);
            }
        }
        if (zG2) {
            mVar.c();
        }
    }

    public final void b(k kVar) {
        this.listeners.add(kVar);
    }

    public final void c() {
        Iterator<k> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f940j);
        }
    }

    public final void d(i5.f fVar, int i10) {
        i5.c cVar = (i5.c) fVar.f9021e;
        if (this.f939i != i10) {
            this.f939i = i10;
            this.f935e++;
            this.f933c.obtainMessage(3, i10, 0).sendToTarget();
        }
        boolean zG = g();
        Iterator<k> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().b(this, cVar, i10);
        }
        if (zG) {
            c();
        }
    }

    public final void e(e0 e0Var) {
        this.listeners.remove(e0Var);
    }

    public final void f(boolean z10) {
        if (this.f938h == z10) {
            return;
        }
        this.f938h = z10;
        this.f935e++;
        this.f933c.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        boolean zG = g();
        Iterator<k> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().f(this, z10);
        }
        if (zG) {
            c();
        }
    }

    public final boolean g() {
        boolean z10;
        if (this.f938h || this.f939i == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f941k.size(); i10++) {
                if (((d) this.f941k.get(i10)).f893b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f940j != z10;
        this.f940j = z10;
        return z11;
    }
}
