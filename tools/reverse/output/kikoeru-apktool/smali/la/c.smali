.class public final synthetic Lla/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/k;


# direct methods
.method public synthetic constructor <init>(Lic/k;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lla/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/c;->b:Lic/k;

    return-void
.end method

.method public synthetic constructor <init>(Lic/k;I)V
    .locals 0

    .line 2
    iput p2, p0, Lla/c;->a:I

    iput-object p1, p0, Lla/c;->b:Lic/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lla/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/t2;

    .line 7
    .line 8
    sget-object v1, Lm0/u2;->a:Lm0/u2;

    .line 9
    .line 10
    iget-object v2, p0, Lla/c;->b:Lic/k;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lm0/t2;-><init>(Lm0/u2;Lic/k;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lla/c;->b:Lic/k;

    .line 17
    .line 18
    sget-object v1, Lbg/f1;->c:Lbg/f1;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    iget-object v0, p0, Lla/c;->b:Lic/k;

    .line 27
    .line 28
    sget-object v1, Lbg/f1;->d:Lbg/f1;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_2
    new-instance v0, Lp1/b;

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lp1/b;-><init>(J)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lla/c;->b:Lic/k;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_3
    new-instance v0, Lp1/b;

    .line 52
    .line 53
    const-wide/16 v1, 0x0

    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, Lp1/b;-><init>(J)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lla/c;->b:Lic/k;

    .line 59
    .line 60
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    return-object v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
