.class public final Ls/x;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/p;


# instance fields
.field public final o:Lw/k;

.field public p:Z

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>(Lw/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj1/p;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/x;->o:Lw/k;

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

.method public final R(Li2/l0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Li2/l0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, Li2/l0;->a:Ls1/b;

    .line 5
    .line 6
    iget-boolean v2, p0, Ls/x;->p:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    sget-wide v2, Lq1/q;->b:J

    .line 11
    .line 12
    const v4, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v4, v2, v3}, Lq1/q;->b(FJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v1, v1, Ls1/b;->b:Lc7/e1;

    .line 20
    .line 21
    invoke-virtual {v1}, Lc7/e1;->D()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-wide v1, v2

    .line 26
    move-wide v3, v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/16 v6, 0x7a

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    invoke-static/range {v0 .. v6}, Lq/t0;->q(Ls1/d;JJFI)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-boolean v0, p0, Ls/x;->q:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    iget-boolean v0, p0, Ls/x;->r:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    :goto_0
    sget-wide v2, Lq1/q;->b:J

    .line 46
    .line 47
    const v0, 0x3dcccccd    # 0.1f

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v2, v3}, Lq1/q;->b(FJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-object v0, v1, Ls1/b;->b:Lc7/e1;

    .line 55
    .line 56
    invoke-virtual {v0}, Lc7/e1;->D()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/16 v6, 0x7a

    .line 62
    .line 63
    move-wide v7, v2

    .line 64
    move-wide v3, v0

    .line 65
    move-wide v1, v7

    .line 66
    move-object v0, p1

    .line 67
    invoke-static/range {v0 .. v6}, Lq/t0;->q(Ls1/d;JJFI)V

    .line 68
    .line 69
    .line 70
    return-void
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
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj1/p;->n0()Lhf/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lba/v0;

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, p0, v3}, Lba/v0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 15
    .line 16
    .line 17
    return-void
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
