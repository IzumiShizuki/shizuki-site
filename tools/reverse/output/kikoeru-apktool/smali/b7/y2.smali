.class public final synthetic Lb7/y2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/p3;
.implements Lp4/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lb7/y2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/y2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lb7/y2;->b:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/y2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm4/d;

    .line 4
    .line 5
    check-cast p1, Lb7/z3;

    .line 6
    .line 7
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    check-cast p1, Lv4/v;

    .line 10
    .line 11
    iget-object v1, p1, Lv4/v;->z:Lv4/d;

    .line 12
    .line 13
    iget-object v2, p1, Lv4/v;->m:Lp4/n;

    .line 14
    .line 15
    invoke-virtual {p1}, Lv4/v;->m2()V

    .line 16
    .line 17
    .line 18
    iget-object v3, p1, Lv4/v;->T:Lm4/d;

    .line 19
    .line 20
    sget v4, Lp4/c0;->a:I

    .line 21
    .line 22
    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x1

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iput-object v0, p1, Lv4/v;->T:Lm4/d;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    invoke-virtual {p1, v4, v3, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroidx/media3/exoplayer/offline/g;

    .line 36
    .line 37
    const/16 v5, 0x13

    .line 38
    .line 39
    invoke-direct {v3, v5, v0}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/16 v5, 0x14

    .line 43
    .line 44
    invoke-virtual {v2, v5, v3}, Lp4/n;->c(ILp4/k;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-boolean v3, p0, Lb7/y2;->b:Z

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    move-object v3, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v3, 0x0

    .line 54
    :goto_0
    invoke-virtual {v1, v3}, Lv4/d;->b(Lm4/d;)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p1, Lv4/v;->i:Lj2/b;

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Lj2/b;->e(Lm4/d;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lv4/v;->r()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1}, Lv4/v;->i()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v1, v3, v0}, Lv4/d;->d(IZ)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v3, -0x1

    .line 75
    if-ne v1, v3, :cond_2

    .line 76
    .line 77
    const/4 v4, 0x2

    .line 78
    :cond_2
    invoke-virtual {p1, v1, v4, v0}, Lv4/v;->j2(IIZ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lp4/n;->b()V

    .line 82
    .line 83
    .line 84
    return-void
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

.method public h(Lb7/c2;Lb7/t1;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p3, p0, Lb7/y2;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lb7/y2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, p3

    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    iget-boolean p3, p0, Lb7/y2;->b:Z

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    const/4 v3, -0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p1, Lb7/c2;->t:Lb7/z3;

    .line 19
    .line 20
    invoke-virtual {v0}, Lb7/z3;->G()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move v3, v0

    .line 25
    :goto_0
    if-eqz p3, :cond_1

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    :goto_1
    move-wide v4, v0

    .line 33
    move-object v0, p1

    .line 34
    move-object v1, p2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    iget-object p3, p1, Lb7/c2;->t:Lb7/z3;

    .line 37
    .line 38
    invoke-virtual {p3}, Lb7/z3;->M()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lb7/c2;->p(Lb7/t1;Ljava/util/List;IJ)Lcb/e0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :pswitch_0
    move-object v0, p1

    .line 49
    move-object v1, p2

    .line 50
    iget-object p1, p0, Lb7/y2;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lm4/i0;

    .line 53
    .line 54
    invoke-static {p1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-boolean p1, p0, Lb7/y2;->b:Z

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    const/4 p2, -0x1

    .line 63
    const/4 v3, -0x1

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    iget-object p2, v0, Lb7/c2;->t:Lb7/z3;

    .line 66
    .line 67
    invoke-virtual {p2}, Lb7/z3;->G()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    move v3, p2

    .line 72
    :goto_3
    if-eqz p1, :cond_3

    .line 73
    .line 74
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    :goto_4
    move-wide v4, p1

    .line 80
    goto :goto_5

    .line 81
    :cond_3
    iget-object p1, v0, Lb7/c2;->t:Lb7/z3;

    .line 82
    .line 83
    invoke-virtual {p1}, Lb7/z3;->M()J

    .line 84
    .line 85
    .line 86
    move-result-wide p1

    .line 87
    goto :goto_4

    .line 88
    :goto_5
    invoke-virtual/range {v0 .. v5}, Lb7/c2;->p(Lb7/t1;Ljava/util/List;IJ)Lcb/e0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method
