package q5;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f17841c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GestureDetector f17843e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f17839a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f17840b = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17842d = 25.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile float f17844f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f17841c = jVar;
        this.f17843e = new GestureDetector(context, this);
    }

    @Override // q5.c
    public final void a(float[] fArr, float f10) {
        this.f17844f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f17839a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x3 = (motionEvent2.getX() - this.f17839a.x) / this.f17842d;
        float y5 = motionEvent2.getY();
        PointF pointF = this.f17839a;
        float f12 = (y5 - pointF.y) / this.f17842d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f17844f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f17840b;
        pointF2.x -= (fCos * x3) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x3) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f17841c;
        PointF pointF3 = this.f17840b;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f17823g = f14;
            Matrix.setRotateM(jVar.f17821e, 0, -f14, (float) Math.cos(jVar.f17824h), (float) Math.sin(jVar.f17824h), 0.0f);
            Matrix.setRotateM(jVar.f17822f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f17841c.f17827k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f17843e.onTouchEvent(motionEvent);
    }
}
