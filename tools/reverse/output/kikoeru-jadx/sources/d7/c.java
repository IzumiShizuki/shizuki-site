package d7;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends View implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f5486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f5488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5489e;

    public c(Context context, int i10) {
        super(context, null);
        this.f5485a = new ArrayList();
        this.f5486b = Collections.EMPTY_LIST;
        this.f5487c = 0.0533f;
        this.f5488d = d.f5490g;
        this.f5489e = 0.08f;
    }

    @Override // d7.j
    public final void a(List list, d dVar, float f10, float f11) {
        this.f5486b = list;
        this.f5488d = dVar;
        this.f5487c = f10;
        this.f5489e = f11;
        while (true) {
            ArrayList arrayList = this.f5485a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new i(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
