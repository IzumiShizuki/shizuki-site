.class public final synthetic Lb7/v2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/n3;
.implements Lb7/p3;
.implements Lp4/g;
.implements Lp4/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p3, p0, Lb7/v2;->c:Ljava/lang/Object;

    iput p4, p0, Lb7/v2;->a:I

    iput-wide p1, p0, Lb7/v2;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo6/m;JI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/v2;->c:Ljava/lang/Object;

    iput-wide p2, p0, Lb7/v2;->b:J

    iput p4, p0, Lb7/v2;->a:I

    return-void
.end method

.method public synthetic constructor <init>(Lw4/a;IJJ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/v2;->c:Ljava/lang/Object;

    iput p2, p0, Lb7/v2;->a:I

    iput-wide p3, p0, Lb7/v2;->b:J

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lb7/v2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw4/a;

    .line 4
    .line 5
    check-cast p1, Lw4/i;

    .line 6
    .line 7
    iget-object v1, p1, Lw4/i;->g:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v2, p1, Lw4/i;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v3, v0, Lw4/a;->d:Lj5/d0;

    .line 12
    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    iget-object p1, p1, Lw4/i;->b:Lw4/f;

    .line 16
    .line 17
    iget-object v0, v0, Lw4/a;->b:Lm4/i1;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v3}, Lw4/f;->d(Lm4/i1;Lj5/d0;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/Long;

    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    move-wide v6, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    :goto_0
    iget-wide v8, p0, Lb7/v2;->b:J

    .line 46
    .line 47
    add-long/2addr v6, v8

    .line 48
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    :goto_1
    iget v0, p0, Lb7/v2;->a:I

    .line 63
    .line 64
    int-to-long v2, v0

    .line 65
    add-long/2addr v4, v2

    .line 66
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
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

.method public accept(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb7/v2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lo6/m;

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    check-cast v2, Lo6/a;

    .line 10
    .line 11
    iget-object v3, v1, Lo6/m;->h:Lm4/q;

    .line 12
    .line 13
    invoke-static {v3}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v2, Lo6/a;->a:Lya/i0;

    .line 17
    .line 18
    iget-wide v4, v2, Lo6/a;->c:J

    .line 19
    .line 20
    invoke-static {v3, v4, v5}, Lm3/l;->r(Lya/i0;J)[B

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v1, Lo6/m;->c:Lp4/s;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    array-length v5, v3

    .line 30
    invoke-virtual {v4, v3, v5}, Lp4/s;->E([BI)V

    .line 31
    .line 32
    .line 33
    iget-object v5, v1, Lo6/m;->a:Lr5/h0;

    .line 34
    .line 35
    array-length v6, v3

    .line 36
    invoke-interface {v5, v6, v4}, Lr5/h0;->e(ILp4/s;)V

    .line 37
    .line 38
    .line 39
    iget-wide v4, v2, Lo6/a;->b:J

    .line 40
    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    iget-wide v8, v0, Lb7/v2;->b:J

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    const-wide v10, 0x7fffffffffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmp-long v12, v4, v6

    .line 55
    .line 56
    if-nez v12, :cond_1

    .line 57
    .line 58
    iget-object v4, v1, Lo6/m;->h:Lm4/q;

    .line 59
    .line 60
    iget-wide v4, v4, Lm4/q;->s:J

    .line 61
    .line 62
    cmp-long v6, v4, v10

    .line 63
    .line 64
    if-nez v6, :cond_0

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v4, 0x0

    .line 69
    :goto_0
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 70
    .line 71
    .line 72
    :goto_1
    move-wide v11, v8

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object v6, v1, Lo6/m;->h:Lm4/q;

    .line 75
    .line 76
    iget-wide v6, v6, Lm4/q;->s:J

    .line 77
    .line 78
    cmp-long v12, v6, v10

    .line 79
    .line 80
    if-nez v12, :cond_2

    .line 81
    .line 82
    add-long/2addr v8, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    add-long v8, v4, v6

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    iget-object v10, v1, Lo6/m;->a:Lr5/h0;

    .line 88
    .line 89
    iget v1, v0, Lb7/v2;->a:I

    .line 90
    .line 91
    or-int/lit8 v13, v1, 0x1

    .line 92
    .line 93
    array-length v14, v3

    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    invoke-interface/range {v10 .. v16}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 98
    .line 99
    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public b(Lb7/z3;Lb7/t1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/v2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/q3;

    .line 4
    .line 5
    iget v1, p0, Lb7/v2;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, p2, p1, v1}, Lb7/q3;->E0(Lb7/t1;Lb7/z3;I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1}, Lb7/z3;->r0()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 15
    .line 16
    check-cast p1, Landroidx/lifecycle/q;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iget-wide v1, p0, Lb7/v2;->b:J

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0, v1, v2}, Landroidx/lifecycle/q;->r1(IZJ)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public h(Lb7/c2;Lb7/t1;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p3, p0, Lb7/v2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, p3

    .line 4
    check-cast v2, Ljava/util/List;

    .line 5
    .line 6
    iget p3, p0, Lb7/v2;->a:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p1, Lb7/c2;->t:Lb7/z3;

    .line 12
    .line 13
    invoke-virtual {v1}, Lb7/z3;->G()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    move v3, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, p3

    .line 20
    :goto_0
    if-ne p3, v0, :cond_1

    .line 21
    .line 22
    iget-object p3, p1, Lb7/c2;->t:Lb7/z3;

    .line 23
    .line 24
    invoke-virtual {p3}, Lb7/z3;->M()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_1
    move-wide v4, v0

    .line 29
    move-object v0, p1

    .line 30
    move-object v1, p2

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget-wide v0, p0, Lb7/v2;->b:J

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lb7/c2;->p(Lb7/t1;Ljava/util/List;IJ)Lcb/e0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
