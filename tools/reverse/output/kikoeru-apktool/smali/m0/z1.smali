.class public final Lm0/z1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lq1/r;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/z1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lm0/z1;->b:Ljava/lang/Object;

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
.method public final a()J
    .locals 7

    .line 1
    iget v0, p0, Lm0/z1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/z1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm0/m5;

    .line 9
    .line 10
    iget-wide v0, v0, Lm0/m5;->c:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lm0/z1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lm0/a2;

    .line 16
    .line 17
    iget-object v1, v0, Lm0/a2;->t:Lq1/r;

    .line 18
    .line 19
    invoke-interface {v1}, Lq1/r;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    const-wide/16 v3, 0x10

    .line 24
    .line 25
    cmp-long v5, v1, v3

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v1, Lm0/l5;->a:Lx0/z;

    .line 31
    .line 32
    invoke-static {v0, v1}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lm0/k5;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-wide v1, v1, Lm0/k5;->a:J

    .line 41
    .line 42
    cmp-long v5, v1, v3

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object v1, Lm0/j1;->a:Lx0/z;

    .line 48
    .line 49
    invoke-static {v0, v1}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lq1/q;

    .line 54
    .line 55
    iget-wide v1, v1, Lq1/q;->a:J

    .line 56
    .line 57
    sget-object v3, Lm0/c1;->a:Lx0/o2;

    .line 58
    .line 59
    invoke-static {v0, v3}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lm0/b1;

    .line 64
    .line 65
    invoke-virtual {v0}, Lm0/b1;->j()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v1, v2}, Lq1/h0;->r(J)F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    float-to-double v3, v3

    .line 76
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 77
    .line 78
    cmpg-double v0, v3, v5

    .line 79
    .line 80
    if-gez v0, :cond_2

    .line 81
    .line 82
    sget-wide v1, Lq1/q;->d:J

    .line 83
    .line 84
    :cond_2
    :goto_0
    return-wide v1

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
