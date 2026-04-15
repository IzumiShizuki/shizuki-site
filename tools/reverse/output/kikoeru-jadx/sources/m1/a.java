package m1;

import a0.f0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import c2.e;
import i2.a1;
import i2.c2;
import i7.p2;
import j1.p;
import jc.u;
import o.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnDragListener, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f14020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f14021c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        d dVar = new d();
        dVar.f14025q = 0L;
        this.f14019a = dVar;
        this.f14020b = new f(0);
        this.f14021c = new a1() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // i2.a1
            public final p h() {
                return this.f673a.f14019a;
            }

            public final int hashCode() {
                return this.f673a.f14019a.hashCode();
            }

            @Override // i2.a1
            public final /* bridge */ /* synthetic */ void l(p pVar) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        p2 p2Var = new p2(dragEvent);
        int action = dragEvent.getAction();
        c2 c2Var = c2.f8657a;
        f fVar = this.f14020b;
        d dVar = this.f14019a;
        switch (action) {
            case 1:
                u uVar = new u();
                e eVar = new e(p2Var, dVar, uVar);
                if (eVar.a(dVar) == c2Var) {
                    i2.f.C(dVar, eVar);
                }
                boolean z10 = uVar.f10834a;
                fVar.getClass();
                o.a aVar = new o.a(fVar);
                while (aVar.hasNext()) {
                    ((d) aVar.next()).F0(p2Var);
                }
                break;
            case 2:
                dVar.E0(p2Var);
                break;
            case 4:
                f0 f0Var = new f0(25, p2Var);
                if (f0Var.a(dVar) == c2Var) {
                    i2.f.C(dVar, f0Var);
                }
                fVar.clear();
                break;
            case 5:
                dVar.C0(p2Var);
                break;
            case 6:
                dVar.D0(p2Var);
                break;
        }
        return false;
    }
}
