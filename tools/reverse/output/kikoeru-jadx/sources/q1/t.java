package q1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final ColorSpace a(r1.c cVar) {
        if (jc.l.a(cVar, r1.d.f18657e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (jc.l.a(cVar, r1.d.f18669q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (jc.l.a(cVar, r1.d.f18670r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (jc.l.a(cVar, r1.d.f18667o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (jc.l.a(cVar, r1.d.f18662j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (jc.l.a(cVar, r1.d.f18661i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (jc.l.a(cVar, r1.d.f18672t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (jc.l.a(cVar, r1.d.f18671s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (jc.l.a(cVar, r1.d.f18663k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (jc.l.a(cVar, r1.d.f18664l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (jc.l.a(cVar, r1.d.f18659g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (jc.l.a(cVar, r1.d.f18660h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (jc.l.a(cVar, r1.d.f18658f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (jc.l.a(cVar, r1.d.f18665m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (jc.l.a(cVar, r1.d.f18668p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (jc.l.a(cVar, r1.d.f18666n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ColorSpace colorSpace = jc.l.a(cVar, r1.d.f18674v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : jc.l.a(cVar, r1.d.f18675w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof r1.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = cVar.f18650a;
        r1.q qVar = (r1.q) cVar;
        float[] fArrA = qVar.f18705d.a();
        r1.r rVar = qVar.f18708g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f18720b, rVar.f18721c, rVar.f18722d, rVar.f18723e, rVar.f18724f, rVar.f18725g, rVar.f18719a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(str, qVar.f18709h, fArrA, transferParameters);
        }
        float[] fArr = qVar.f18709h;
        final r1.p pVar = qVar.f18713l;
        final int i10 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: q1.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                switch (i10) {
                }
                return ((Number) pVar.a(Double.valueOf(d10))).doubleValue();
            }
        };
        final r1.p pVar2 = qVar.f18716o;
        final int i11 = 1;
        return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: q1.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                switch (i11) {
                }
                return ((Number) pVar2.a(Double.valueOf(d10))).doubleValue();
            }
        }, qVar.f18706e, qVar.f18707f);
    }
}
