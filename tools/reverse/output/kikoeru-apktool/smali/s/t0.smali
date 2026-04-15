.class public final Ls/t0;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/q;
.implements Li2/p;
.implements Li2/y1;
.implements Li2/k1;


# instance fields
.field public o:Ljc/m;

.field public p:Ljc/m;

.field public q:Ls/e1;

.field public r:Landroid/view/View;

.field public s:Lf3/c;

.field public t:Ls/d1;

.field public final u:Lx0/e1;

.field public v:Lx0/c0;

.field public w:J

.field public x:Lf3/l;

.field public y:Lkf/f;


# direct methods
.method public constructor <init>(Lic/k;Lic/k;Ls/e1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj1/p;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljc/m;

    .line 5
    .line 6
    iput-object p1, p0, Ls/t0;->o:Ljc/m;

    .line 7
    .line 8
    check-cast p2, Ljc/m;

    .line 9
    .line 10
    iput-object p2, p0, Ls/t0;->p:Ljc/m;

    .line 11
    .line 12
    iput-object p3, p0, Ls/t0;->q:Ls/e1;

    .line 13
    .line 14
    sget-object p1, Lx0/r0;->c:Lx0/r0;

    .line 15
    .line 16
    new-instance p2, Lx0/e1;

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    invoke-direct {p2, p3, p1}, Lx0/e1;-><init>(Ljava/lang/Object;Lx0/i2;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Ls/t0;->u:Lx0/e1;

    .line 23
    .line 24
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide p1, p0, Ls/t0;->w:J

    .line 30
    .line 31
    return-void
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
.method public final synthetic A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final B0()J
    .locals 2

    .line 1
    iget-object v0, p0, Ls/t0;->v:Lx0/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ls/s0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Ls/s0;-><init>(Ls/t0;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lx0/v;->o(Lic/a;)Lx0/c0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ls/t0;->v:Lx0/c0;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ls/t0;->v:Lx0/c0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lp1/b;

    .line 26
    .line 27
    iget-wide v0, v0, Lp1/b;->a:J

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    return-wide v0
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
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ls/f1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ls/f1;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ls/t0;->r:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Li2/f;->A(Li2/m;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    iput-object v0, p0, Ls/t0;->r:Landroid/view/View;

    .line 19
    .line 20
    iget-object v1, p0, Ls/t0;->s:Lf3/c;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Li2/j0;->y:Lf3/c;

    .line 29
    .line 30
    :cond_2
    iput-object v1, p0, Ls/t0;->s:Lf3/c;

    .line 31
    .line 32
    iget-object v2, p0, Ls/t0;->q:Ls/e1;

    .line 33
    .line 34
    invoke-interface {v2, v0, v1}, Ls/e1;->b(Landroid/view/View;Lf3/c;)Ls/d1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 39
    .line 40
    invoke-virtual {p0}, Ls/t0;->E0()V

    .line 41
    .line 42
    .line 43
    return-void
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
.end method

.method public final D0()V
    .locals 9

    .line 1
    iget-object v0, p0, Ls/t0;->s:Lf3/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Li2/j0;->y:Lf3/c;

    .line 10
    .line 11
    iput-object v0, p0, Ls/t0;->s:Lf3/c;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Ls/t0;->o:Ljc/m;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lp1/b;

    .line 20
    .line 21
    iget-wide v0, v0, Lp1/b;->a:J

    .line 22
    .line 23
    const-wide v2, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long v4, v0, v2

    .line 29
    .line 30
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long v8, v4, v6

    .line 36
    .line 37
    if-eqz v8, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Ls/t0;->B0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    and-long/2addr v2, v4

    .line 44
    cmp-long v4, v2, v6

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Ls/t0;->B0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-static {v2, v3, v0, v1}, Lp1/b;->i(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p0, Ls/t0;->w:J

    .line 57
    .line 58
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Ls/t0;->C0()V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-wide v1, p0, Ls/t0;->w:J

    .line 70
    .line 71
    invoke-interface {v0, v1, v2, v6, v7}, Ls/d1;->a(JJ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Ls/t0;->E0()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iput-wide v6, p0, Ls/t0;->w:J

    .line 79
    .line 80
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    check-cast v0, Ls/f1;

    .line 85
    .line 86
    invoke-virtual {v0}, Ls/f1;->b()V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final E0()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Ls/t0;->s:Lf3/c;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast v0, Ls/f1;

    .line 12
    .line 13
    invoke-virtual {v0}, Ls/f1;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, Ls/t0;->x:Lf3/l;

    .line 18
    .line 19
    invoke-static {v2, v3, v4}, Lf3/l;->a(JLjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Ls/t0;->p:Ljc/m;

    .line 26
    .line 27
    invoke-virtual {v0}, Ls/f1;->c()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v3, v4}, Lgh/g;->R(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-interface {v1, v3, v4}, Lf3/c;->n(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    new-instance v1, Lf3/h;

    .line 40
    .line 41
    invoke-direct {v1, v3, v4}, Lf3/h;-><init>(J)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ls/f1;->c()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    new-instance v2, Lf3/l;

    .line 52
    .line 53
    invoke-direct {v2, v0, v1}, Lf3/l;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Ls/t0;->x:Lf3/l;

    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final synthetic G()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final L(Lq2/k;)V
    .locals 3

    .line 1
    sget-object v0, Ls/u0;->a:Lq2/w;

    .line 2
    .line 3
    new-instance v1, Ls/s0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Ls/s0;-><init>(Ls/t0;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final R(Li2/l0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Li2/l0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ls/t0;->y:Lkf/f;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkf/u;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final W()V
    .locals 2

    .line 1
    new-instance v0, Ls/s0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Ls/s0;-><init>(Ls/t0;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Li2/f;->t(Lj1/p;Lic/a;)V

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
.end method

.method public final synthetic h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final synthetic k0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final r0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls/t0;->W()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v0, v2}, Lg8/a;->c(IILkf/a;)Lkf/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ls/t0;->y:Lkf/f;

    .line 12
    .line 13
    invoke-virtual {p0}, Lj1/p;->n0()Lhf/y;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lba/v0;

    .line 18
    .line 19
    const/16 v3, 0x11

    .line 20
    .line 21
    invoke-direct {v1, v3, p0, v2}, Lba/v0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    sget-object v4, Lhf/z;->d:Lhf/z;

    .line 26
    .line 27
    invoke-static {v0, v2, v4, v1, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public final t0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ls/f1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ls/f1;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ls/t0;->t:Ls/d1;

    .line 12
    .line 13
    return-void
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
.end method

.method public final u(Li2/g1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/t0;->u:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
