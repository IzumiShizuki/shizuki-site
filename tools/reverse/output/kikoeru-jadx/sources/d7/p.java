package d7;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f5539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f5540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5542f;

    public p(Context context) {
        super(context, null);
        this.f5539c = Collections.EMPTY_LIST;
        this.f5540d = d.f5490g;
        this.f5541e = 0.0533f;
        this.f5542f = 0.08f;
        c cVar = new c(context, 0);
        this.f5537a = cVar;
        n nVar = new n(context, null);
        this.f5538b = nVar;
        nVar.setBackgroundColor(0);
        addView(cVar);
        addView(nVar);
    }

    @Override // d7.j
    public final void a(List list, d dVar, float f10, float f11) {
        this.f5540d = dVar;
        this.f5541e = f10;
        this.f5542f = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            o4.b bVar = (o4.b) list.get(i10);
            if (bVar.f16200d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f5539c.isEmpty() || !arrayList2.isEmpty()) {
            this.f5539c = arrayList2;
            c();
        }
        this.f5537a.a(arrayList, dVar, f10, f11);
        invalidate();
    }

    public final String b(float f10, int i10) {
        float fO = a.a.O(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fO == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fO / getContext().getResources().getDisplayMetrics().density)};
        int i11 = c0.f16548a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.p.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f5539c.isEmpty()) {
            return;
        }
        c();
    }
}
