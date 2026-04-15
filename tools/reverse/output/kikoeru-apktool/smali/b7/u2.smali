.class public final synthetic Lb7/u2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lp4/g;
.implements Lp4/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    .line 1
    iput p2, p0, Lb7/u2;->a:I

    .line 2
    .line 3
    iput p1, p0, Lb7/u2;->b:F

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lb7/u2;->b:F

    .line 2
    .line 3
    check-cast p1, Lm4/w0;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lm4/w0;->p(F)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lb7/u2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lb7/z3;

    .line 7
    .line 8
    invoke-virtual {p1}, Lb7/z3;->r0()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    check-cast p1, Lv4/v;

    .line 14
    .line 15
    invoke-virtual {p1}, Lv4/v;->m2()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    iget v2, p0, Lb7/u2;->b:F

    .line 22
    .line 23
    invoke-static {v2, v0, v1}, Lp4/c0;->h(FFF)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v1, p1, Lv4/v;->U:F

    .line 28
    .line 29
    cmpl-float v1, v1, v0

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput v0, p1, Lv4/v;->U:F

    .line 35
    .line 36
    iget-object v1, p1, Lv4/v;->z:Lv4/d;

    .line 37
    .line 38
    iget v1, v1, Lv4/d;->g:F

    .line 39
    .line 40
    mul-float v1, v1, v0

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-virtual {p1, v3, v2, v1}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Lv4/v;->m:Lp4/n;

    .line 52
    .line 53
    new-instance v1, Lb7/u2;

    .line 54
    .line 55
    invoke-direct {v1, v0, v2}, Lb7/u2;-><init>(FI)V

    .line 56
    .line 57
    .line 58
    const/16 v0, 0x16

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lp4/n;->e(ILp4/k;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    return-void

    .line 64
    :pswitch_0
    iget v0, p0, Lb7/u2;->b:F

    .line 65
    .line 66
    check-cast p1, Lb7/z3;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lb7/z3;->m0(F)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
