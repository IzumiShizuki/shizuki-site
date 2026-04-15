package m7;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f14909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14910e;

    public k0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public void a() {
        ((ArrayList) this.f14909d).clear();
        this.f14906a = Integer.MIN_VALUE;
        this.f14907b = Integer.MIN_VALUE;
    }

    public void b() {
        int i10 = this.f14908c;
        this.f14908c = i10 == Integer.MIN_VALUE ? this.f14906a : i10 + this.f14907b;
        this.f14910e = ((String) this.f14909d) + this.f14908c;
    }

    public int c(int i10) {
        int i11 = this.f14907b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f14909d).size() == 0) {
            return i10;
        }
        View view = (View) ((ArrayList) this.f14909d).get(r3.size() - 1);
        h0 h0Var = (h0) view.getLayoutParams();
        this.f14907b = ((StaggeredGridLayoutManager) this.f14910e).f1058j.c1(view);
        h0Var.getClass();
        return this.f14907b;
    }

    public void d() {
        if (this.f14908c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public k0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f14909d = str;
        this.f14906a = i11;
        this.f14907b = i12;
        this.f14908c = Integer.MIN_VALUE;
        this.f14910e = "";
    }

    public k0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f14910e = staggeredGridLayoutManager;
        this.f14909d = new ArrayList();
        this.f14906a = Integer.MIN_VALUE;
        this.f14907b = Integer.MIN_VALUE;
        this.f14908c = i10;
    }
}
