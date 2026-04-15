.class public final Lr/n1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:Lr/q1;

.field public final synthetic c:F


# direct methods
.method public constructor <init>(Lr/q1;F)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/n1;->b:Lr/q1;

    .line 2
    .line 3
    iput p2, p0, Lr/n1;->c:F

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, Lr/n1;->b:Lr/q1;

    .line 8
    .line 9
    invoke-virtual {p1}, Lr/q1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p1, Lr/q1;->g:Lx0/c1;

    .line 14
    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    iget-object v2, v3, Lx0/c1;->b:Lx0/g2;

    .line 18
    .line 19
    invoke-static {v2, v3}, Lh1/n;->u(Lh1/g0;Lh1/e0;)Lh1/g0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lx0/g2;

    .line 24
    .line 25
    iget-wide v4, v2, Lx0/g2;->c:J

    .line 26
    .line 27
    const-wide/high16 v6, -0x8000000000000000L

    .line 28
    .line 29
    cmp-long v2, v4, v6

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v0, v1}, Lx0/c1;->e(J)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Lr/q1;->a:Landroidx/lifecycle/q;

    .line 37
    .line 38
    iget-object v2, v2, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lx0/e1;

    .line 41
    .line 42
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v2, v4}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v2, v3, Lx0/c1;->b:Lx0/g2;

    .line 48
    .line 49
    invoke-static {v2, v3}, Lh1/n;->u(Lh1/g0;Lh1/e0;)Lh1/g0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lx0/g2;

    .line 54
    .line 55
    iget-wide v2, v2, Lx0/g2;->c:J

    .line 56
    .line 57
    sub-long/2addr v0, v2

    .line 58
    const/4 v2, 0x0

    .line 59
    iget v3, p0, Lr/n1;->c:F

    .line 60
    .line 61
    cmpg-float v2, v3, v2

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    long-to-double v0, v0

    .line 67
    float-to-double v3, v3

    .line 68
    div-double/2addr v0, v3

    .line 69
    invoke-static {v0, v1}, Llc/b;->S(D)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    :goto_0
    invoke-virtual {p1, v0, v1}, Lr/q1;->n(J)V

    .line 74
    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/4 v2, 0x0

    .line 81
    :goto_1
    invoke-virtual {p1, v0, v1, v2}, Lr/q1;->h(JZ)V

    .line 82
    .line 83
    .line 84
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 85
    .line 86
    return-object p1
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
