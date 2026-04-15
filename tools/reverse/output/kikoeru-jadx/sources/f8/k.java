package f8;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f6883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6884k;

    public k() {
        this.f6874a = new Matrix();
        this.f6875b = new ArrayList();
        this.f6876c = 0.0f;
        this.f6877d = 0.0f;
        this.f6878e = 0.0f;
        this.f6879f = 1.0f;
        this.f6880g = 1.0f;
        this.f6881h = 0.0f;
        this.f6882i = 0.0f;
        this.f6883j = new Matrix();
        this.f6884k = null;
    }

    @Override // f8.l
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6875b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // f8.l
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f6875b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.f6883j;
        matrix.reset();
        matrix.postTranslate(-this.f6877d, -this.f6878e);
        matrix.postScale(this.f6879f, this.f6880g);
        matrix.postRotate(this.f6876c, 0.0f, 0.0f);
        matrix.postTranslate(this.f6881h + this.f6877d, this.f6882i + this.f6878e);
    }

    public String getGroupName() {
        return this.f6884k;
    }

    public Matrix getLocalMatrix() {
        return this.f6883j;
    }

    public float getPivotX() {
        return this.f6877d;
    }

    public float getPivotY() {
        return this.f6878e;
    }

    public float getRotation() {
        return this.f6876c;
    }

    public float getScaleX() {
        return this.f6879f;
    }

    public float getScaleY() {
        return this.f6880g;
    }

    public float getTranslateX() {
        return this.f6881h;
    }

    public float getTranslateY() {
        return this.f6882i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f6877d) {
            this.f6877d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f6878e) {
            this.f6878e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f6876c) {
            this.f6876c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f6879f) {
            this.f6879f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f6880g) {
            this.f6880g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f6881h) {
            this.f6881h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f6882i) {
            this.f6882i = f10;
            c();
        }
    }

    public k(k kVar, o.e eVar) {
        m iVar;
        this.f6874a = new Matrix();
        this.f6875b = new ArrayList();
        this.f6876c = 0.0f;
        this.f6877d = 0.0f;
        this.f6878e = 0.0f;
        this.f6879f = 1.0f;
        this.f6880g = 1.0f;
        this.f6881h = 0.0f;
        this.f6882i = 0.0f;
        Matrix matrix = new Matrix();
        this.f6883j = matrix;
        this.f6884k = null;
        this.f6876c = kVar.f6876c;
        this.f6877d = kVar.f6877d;
        this.f6878e = kVar.f6878e;
        this.f6879f = kVar.f6879f;
        this.f6880g = kVar.f6880g;
        this.f6881h = kVar.f6881h;
        this.f6882i = kVar.f6882i;
        String str = kVar.f6884k;
        this.f6884k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(kVar.f6883j);
        ArrayList arrayList = kVar.f6875b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof k) {
                this.f6875b.add(new k((k) obj, eVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f6864e = 0.0f;
                    jVar2.f6866g = 1.0f;
                    jVar2.f6867h = 1.0f;
                    jVar2.f6868i = 0.0f;
                    jVar2.f6869j = 1.0f;
                    jVar2.f6870k = 0.0f;
                    jVar2.f6871l = Paint.Cap.BUTT;
                    jVar2.f6872m = Paint.Join.MITER;
                    jVar2.f6873n = 4.0f;
                    jVar2.f6863d = jVar.f6863d;
                    jVar2.f6864e = jVar.f6864e;
                    jVar2.f6866g = jVar.f6866g;
                    jVar2.f6865f = jVar.f6865f;
                    jVar2.f6887c = jVar.f6887c;
                    jVar2.f6867h = jVar.f6867h;
                    jVar2.f6868i = jVar.f6868i;
                    jVar2.f6869j = jVar.f6869j;
                    jVar2.f6870k = jVar.f6870k;
                    jVar2.f6871l = jVar.f6871l;
                    jVar2.f6872m = jVar.f6872m;
                    jVar2.f6873n = jVar.f6873n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f6875b.add(iVar);
                Object obj2 = iVar.f6886b;
                if (obj2 != null) {
                    eVar.put(obj2, iVar);
                }
            }
        }
    }
}
