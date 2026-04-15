.class public final Lw1/d0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lw1/e0;


# direct methods
.method public synthetic constructor <init>(Lw1/e0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw1/d0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lw1/d0;->c:Lw1/e0;

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
    .locals 9

    .line 1
    iget v0, p0, Lw1/d0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ls1/d;

    .line 7
    .line 8
    iget-object v0, p0, Lw1/d0;->c:Lw1/e0;

    .line 9
    .line 10
    iget-object v1, v0, Lw1/e0;->b:Lw1/c;

    .line 11
    .line 12
    iget v2, v0, Lw1/e0;->k:F

    .line 13
    .line 14
    iget v0, v0, Lw1/e0;->l:F

    .line 15
    .line 16
    invoke-interface {p1}, Ls1/d;->S()Lc7/e1;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Lc7/e1;->D()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-virtual {v3}, Lc7/e1;->z()Lq1/o;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-interface {v6}, Lq1/o;->f()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v6, v3, Lc7/e1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Lr/y1;

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    invoke-virtual {v6, v2, v0, v7, v8}, Lr/y1;->g0(FFJ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lw1/c;->a(Ls1/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4, v5}, Lq/t0;->L(Lc7/e1;J)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-static {v3, v4, v5}, Lq/t0;->L(Lc7/e1;J)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :pswitch_0
    check-cast p1, Lw1/c0;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iget-object v0, p0, Lw1/d0;->c:Lw1/e0;

    .line 58
    .line 59
    iput-boolean p1, v0, Lw1/e0;->d:Z

    .line 60
    .line 61
    iget-object p1, v0, Lw1/e0;->f:Ljc/m;

    .line 62
    .line 63
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
