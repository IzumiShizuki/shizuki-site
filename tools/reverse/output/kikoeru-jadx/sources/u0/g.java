package u0;

import android.content.Context;
import android.view.ViewGroup;
import com.cnl.kikoeru.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f21193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21194e;

    public g(Context context) {
        super(context);
        this.f21190a = 5;
        ArrayList arrayList = new ArrayList();
        this.f21191b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f21192c = arrayList2;
        this.f21193d = new w(24);
        setClipChildren(false);
        i iVar = new i(context);
        addView(iVar);
        arrayList.add(iVar);
        arrayList2.add(iVar);
        this.f21194e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final i a(h hVar) {
        w wVar = this.f21193d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f13782b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) wVar.f13782b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) wVar.f13783c;
        i iVar = (i) linkedHashMap.get(hVar);
        if (iVar != null) {
            return iVar;
        }
        ArrayList arrayList = this.f21192c;
        jc.l.e(arrayList, "<this>");
        i iVar2 = (i) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (iVar2 == null) {
            int i10 = this.f21194e;
            ArrayList arrayList2 = this.f21191b;
            if (i10 > ud.b.r(arrayList2)) {
                iVar2 = new i(getContext());
                addView(iVar2);
                arrayList2.add(iVar2);
            } else {
                iVar2 = (i) arrayList2.get(this.f21194e);
                h hVar2 = (h) linkedHashMap3.get(iVar2);
                if (hVar2 != null) {
                    hVar2.C();
                    i iVar3 = (i) linkedHashMap2.get(hVar2);
                    if (iVar3 != null) {
                    }
                    linkedHashMap2.remove(hVar2);
                    iVar2.c();
                }
            }
            int i11 = this.f21194e;
            if (i11 < this.f21190a - 1) {
                this.f21194e = i11 + 1;
            } else {
                this.f21194e = 0;
            }
        }
        linkedHashMap2.put(hVar, iVar2);
        linkedHashMap3.put(iVar2, hVar);
        return iVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
