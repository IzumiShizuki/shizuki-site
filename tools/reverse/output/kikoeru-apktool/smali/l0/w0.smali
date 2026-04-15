.class public final Ll0/w0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lic/a;


# direct methods
.method public synthetic constructor <init>(ILic/a;)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/w0;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Ll0/w0;->c:Lic/a;

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
    .locals 6

    .line 1
    iget v0, p0, Ll0/w0;->b:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v2, p0, Ll0/w0;->c:Lic/a;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lq2/k;

    .line 11
    .line 12
    new-instance v0, Lq2/g;

    .line 13
    .line 14
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    new-instance v3, Loc/a;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/high16 v5, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-direct {v3, v4, v5}, Loc/a;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v0, v2, v3, v4}, Lq2/g;-><init>(FLoc/a;I)V

    .line 34
    .line 35
    .line 36
    sget-object v2, Lq2/v;->a:[Lpc/u;

    .line 37
    .line 38
    sget-object v2, Lq2/t;->c:Lq2/w;

    .line 39
    .line 40
    sget-object v3, Lq2/v;->a:[Lpc/u;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    aget-object v3, v3, v4

    .line 44
    .line 45
    invoke-virtual {v2, p1, v0}, Lq2/w;->a(Lq2/k;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_0
    check-cast p1, Lc2/t;

    .line 50
    .line 51
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_1
    check-cast p1, Lf3/c;

    .line 56
    .line 57
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lp1/b;

    .line 62
    .line 63
    iget-wide v0, p1, Lp1/b;->a:J

    .line 64
    .line 65
    new-instance p1, Lp1/b;

    .line 66
    .line 67
    invoke-direct {p1, v0, v1}, Lp1/b;-><init>(J)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_2
    check-cast p1, Lf3/c;

    .line 72
    .line 73
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lp1/b;

    .line 78
    .line 79
    iget-wide v0, p1, Lp1/b;->a:J

    .line 80
    .line 81
    new-instance p1, Lp1/b;

    .line 82
    .line 83
    invoke-direct {p1, v0, v1}, Lp1/b;-><init>(J)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
