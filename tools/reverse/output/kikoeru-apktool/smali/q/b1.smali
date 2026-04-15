.class public final Lq/b1;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/p;
.implements Lh2/e;


# instance fields
.field public o:Lq/q1;

.field public p:Lb0/d0;

.field public q:Lic/n;

.field public final r:Lx0/a1;

.field public s:Lq/z0;


# direct methods
.method public constructor <init>(Lq/q1;Lb0/d0;Lic/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj1/p;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/b1;->o:Lq/q1;

    .line 5
    .line 6
    iput-object p2, p0, Lq/b1;->p:Lb0/d0;

    .line 7
    .line 8
    iput-object p3, p0, Lq/b1;->q:Lic/n;

    .line 9
    .line 10
    new-instance p1, Lx0/a1;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, Lx0/a1;-><init>(F)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lq/b1;->r:Lx0/a1;

    .line 17
    .line 18
    return-void
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

.method public final synthetic K()La2/c;
    .locals 1

    .line 1
    sget-object v0, Lh2/b;->d:Lh2/b;

    .line 2
    .line 3
    return-object v0
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

.method public final R(Li2/l0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/b1;->s:Lq/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq/z0;->a:Lt1/b;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v1, Lq/a1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v2}, Lq/a1;-><init>(Li2/l0;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Lq/t0;->N(Li2/l0;Lt1/b;Lic/k;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lq/b1;->p:Lb0/d0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lb0/d0;->b()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p1, v0}, Lu3/x0;->k(Ls1/d;Lt1/b;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "Error: layer never initialized"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
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
.end method

.method public final r0()V
    .locals 2

    .line 1
    new-instance v0, Lq/z0;

    .line 2
    .line 3
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lq1/v;->b()Lt1/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, Lq/z0;-><init>(Lq/b1;Lt1/b;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lq/b1;->o:Lq/q1;

    .line 15
    .line 16
    iget-object v1, v1, Lq/q1;->i:Lh1/s;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lq/b1;->s:Lq/z0;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final synthetic s(Lh2/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La0/c;->a(Lh2/e;Lh2/g;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final t0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq/b1;->s:Lq/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lq/b1;->o:Lq/q1;

    .line 6
    .line 7
    iget-object v1, v1, Lq/q1;->i:Lh1/s;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Li2/f;->w(Lj1/p;)Lq1/v;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v0, v0, Lq/z0;->a:Lt1/b;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lq1/v;->a(Lt1/b;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
