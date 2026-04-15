package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import n7.b0;
import o.s;
import o.t;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public s I;
    public v0 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f9535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f9536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f9540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9555z;

    public b(b bVar, e eVar, Resources resources) {
        this.f9538i = false;
        this.f9541l = false;
        this.f9552w = true;
        this.f9554y = 0;
        this.f9555z = 0;
        this.f9530a = eVar;
        this.f9531b = resources != null ? resources : bVar != null ? bVar.f9531b : null;
        int i10 = bVar != null ? bVar.f9532c : 0;
        int i11 = f.f9568m;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f9532c = i10;
        if (bVar != null) {
            this.f9533d = bVar.f9533d;
            this.f9534e = bVar.f9534e;
            this.f9550u = true;
            this.f9551v = true;
            this.f9538i = bVar.f9538i;
            this.f9541l = bVar.f9541l;
            this.f9552w = bVar.f9552w;
            this.f9553x = bVar.f9553x;
            this.f9554y = bVar.f9554y;
            this.f9555z = bVar.f9555z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f9532c == i10) {
                if (bVar.f9539j) {
                    this.f9540k = bVar.f9540k != null ? new Rect(bVar.f9540k) : null;
                    this.f9539j = true;
                }
                if (bVar.f9542m) {
                    this.f9543n = bVar.f9543n;
                    this.f9544o = bVar.f9544o;
                    this.f9545p = bVar.f9545p;
                    this.f9546q = bVar.f9546q;
                    this.f9542m = true;
                }
            }
            if (bVar.f9547r) {
                this.f9548s = bVar.f9548s;
                this.f9547r = true;
            }
            if (bVar.f9549t) {
                this.f9549t = true;
            }
            Drawable[] drawableArr = bVar.f9536g;
            this.f9536g = new Drawable[drawableArr.length];
            this.f9537h = bVar.f9537h;
            SparseArray sparseArray = bVar.f9535f;
            if (sparseArray != null) {
                this.f9535f = sparseArray.clone();
            } else {
                this.f9535f = new SparseArray(this.f9537h);
            }
            int i12 = this.f9537h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f9535f.put(i13, constantState);
                    } else {
                        this.f9536g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f9536g = new Drawable[10];
            this.f9537h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f9536g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new s((Object) null);
            this.J = new v0(0);
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.f9537h;
        if (i10 >= this.f9536g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f9536g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f9536g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(this.H, 0, iArr, 0, i10);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f9530a);
        this.f9536g[i10] = drawable;
        this.f9537h++;
        this.f9534e = drawable.getChangingConfigurations() | this.f9534e;
        this.f9547r = false;
        this.f9549t = false;
        this.f9540k = null;
        this.f9539j = false;
        this.f9542m = false;
        this.f9550u = false;
        return i10;
    }

    public final void b() {
        this.f9542m = true;
        c();
        int i10 = this.f9537h;
        Drawable[] drawableArr = this.f9536g;
        this.f9544o = -1;
        this.f9543n = -1;
        this.f9546q = 0;
        this.f9545p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f9543n) {
                this.f9543n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f9544o) {
                this.f9544o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f9545p) {
                this.f9545p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f9546q) {
                this.f9546q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f9535f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f9535f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f9535f.valueAt(i10);
                Drawable[] drawableArr = this.f9536g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f9531b);
                if (Build.VERSION.SDK_INT >= 23) {
                    b0.y(drawableNewDrawable, this.f9553x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f9530a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f9535f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f9537h;
        Drawable[] drawableArr = this.f9536g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f9535f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f9536g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f9535f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9535f.valueAt(iIndexOfKey)).newDrawable(this.f9531b);
        if (Build.VERSION.SDK_INT >= 23) {
            b0.y(drawableNewDrawable, this.f9553x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f9530a);
        this.f9536g[i10] = drawableMutate;
        this.f9535f.removeAt(iIndexOfKey);
        if (this.f9535f.size() == 0) {
            this.f9535f = null;
        }
        return drawableMutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        v0 v0Var = this.J;
        Object obj2 = 0;
        int iA = p.a.a(v0Var.f16059b, v0Var.f16061d, i10);
        if (iA >= 0 && (obj = v0Var.f16060c[iA]) != t.f16043c) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i10 = this.f9537h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f9533d | this.f9534e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
