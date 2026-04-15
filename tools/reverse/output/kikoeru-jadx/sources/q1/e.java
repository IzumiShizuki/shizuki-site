package q1;

import android.content.Context;
import android.os.Build;
import com.cnl.kikoeru.R;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f17499f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.v f17500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17501b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u1.c f17502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f17504e;

    public e(j2.v vVar) {
        this.f17500a = vVar;
        d dVar = new d(this);
        this.f17504e = dVar;
        if (vVar.isAttachedToWindow()) {
            Context context = vVar.getContext();
            if (!this.f17503d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.f17503d = true;
            }
        }
        vVar.addOnAttachStateChangeListener(new j2.y(3, this));
    }

    @Override // q1.v
    public final void a(t1.b bVar) {
        synchronized (this.f17501b) {
            if (!bVar.f20157s) {
                bVar.f20157s = true;
                bVar.b();
            }
        }
    }

    @Override // q1.v
    public final t1.b b() {
        t1.d iVar;
        t1.b bVar;
        synchronized (this.f17501b) {
            try {
                j2.v vVar = this.f17500a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    vVar.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    iVar = new t1.g();
                } else if (!f17499f || i10 < 23) {
                    iVar = new t1.i(c(this.f17500a));
                } else {
                    try {
                        iVar = new t1.e(this.f17500a, new p(), new s1.b());
                    } catch (Throwable unused) {
                        f17499f = false;
                        iVar = new t1.i(c(this.f17500a));
                    }
                }
                bVar = new t1.b(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final u1.a c(j2.v vVar) {
        u1.c cVar = this.f17502c;
        if (cVar != null) {
            return cVar;
        }
        u1.c cVar2 = new u1.c(vVar.getContext());
        cVar2.setClipChildren(false);
        cVar2.setClipToPadding(false);
        cVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        vVar.addView(cVar2, -1);
        this.f17502c = cVar2;
        return cVar2;
    }
}
