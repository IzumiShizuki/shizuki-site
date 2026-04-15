.class public final synthetic Lh1/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/k;

.field public final synthetic c:Lic/k;


# direct methods
.method public synthetic constructor <init>(Lic/k;Lic/k;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh1/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh1/l;->b:Lic/k;

    .line 4
    .line 5
    iput-object p2, p0, Lh1/l;->c:Lic/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lh1/l;->a:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lh1/l;->c:Lic/k;

    .line 6
    .line 7
    iget-object v3, p0, Lh1/l;->b:Lic/k;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lq2/k;

    .line 13
    .line 14
    const-string v0, "$this$semantics"

    .line 15
    .line 16
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lla/c;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v0, v2, v4}, Lla/c;-><init>(Lic/k;I)V

    .line 23
    .line 24
    .line 25
    sget-object v2, Lq2/v;->a:[Lpc/u;

    .line 26
    .line 27
    sget-object v2, Lq2/j;->b:Lq2/w;

    .line 28
    .line 29
    new-instance v4, Lq2/a;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-direct {v4, v5, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2, v4}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    new-instance v0, Lla/c;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, v3, v2}, Lla/c;-><init>(Lic/k;I)V

    .line 44
    .line 45
    .line 46
    sget-object v2, Lq2/j;->c:Lq2/w;

    .line 47
    .line 48
    new-instance v3, Lq2/a;

    .line 49
    .line 50
    invoke-direct {v3, v5, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v2, v3}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-object v1

    .line 57
    :pswitch_0
    invoke-interface {v3, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_1
    invoke-interface {v3, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-interface {v2, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-object v1

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
