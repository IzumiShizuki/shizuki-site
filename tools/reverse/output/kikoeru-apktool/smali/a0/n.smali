.class public final La0/n;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, La0/n;->b:I

    .line 2
    .line 3
    iput-object p1, p0, La0/n;->c:Lx0/w0;

    .line 4
    .line 5
    const/4 p1, 0x0

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
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, La0/n;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La0/n;->c:Lx0/w0;

    .line 7
    .line 8
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lp1/b;

    .line 13
    .line 14
    iget-wide v0, v0, Lp1/b;->a:J

    .line 15
    .line 16
    new-instance v2, Lp1/b;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Lp1/b;-><init>(J)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :pswitch_0
    iget-object v0, p0, La0/n;->c:Lx0/w0;

    .line 23
    .line 24
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lu0/e;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_1
    iget-object v0, p0, La0/n;->c:Lx0/w0;

    .line 32
    .line 33
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_2
    new-instance v0, Lc0/f;

    .line 44
    .line 45
    iget-object v1, p0, La0/n;->c:Lx0/w0;

    .line 46
    .line 47
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lic/k;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lc0/f;-><init>(Lic/k;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_3
    iget-object v0, p0, La0/n;->c:Lx0/w0;

    .line 58
    .line 59
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lic/a;

    .line 64
    .line 65
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lb0/n0;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_4
    new-instance v0, La0/j;

    .line 73
    .line 74
    iget-object v1, p0, La0/n;->c:Lx0/w0;

    .line 75
    .line 76
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lic/k;

    .line 81
    .line 82
    invoke-direct {v0, v1}, La0/j;-><init>(Lic/k;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
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
.end method
