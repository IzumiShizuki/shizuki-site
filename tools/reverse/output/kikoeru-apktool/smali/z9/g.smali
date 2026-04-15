.class public final synthetic Lz9/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lz9/r;

.field public final synthetic c:Lhf/y;


# direct methods
.method public synthetic constructor <init>(Lhf/y;Lz9/r;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lz9/g;->a:I

    sget-object v0, Lj9/b0;->a:Lj9/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/g;->c:Lhf/y;

    iput-object p2, p0, Lz9/g;->b:Lz9/r;

    return-void
.end method

.method public synthetic constructor <init>(Lz9/r;Lhf/y;I)V
    .locals 0

    .line 2
    iput p3, p0, Lz9/g;->a:I

    iput-object p1, p0, Lz9/g;->b:Lz9/r;

    iput-object p2, p0, Lz9/g;->c:Lhf/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lz9/g;->a:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lz9/g;->c:Lhf/y;

    .line 8
    .line 9
    iget-object v5, p0, Lz9/g;->b:Lz9/r;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v5, Lz9/r;->k:Lx0/e1;

    .line 15
    .line 16
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, v6}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lz9/i;

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    invoke-direct {v0, v5, v3, v6}, Lz9/i;-><init>(Lz9/r;Lyb/c;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v4, v3, v3, v0, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    const/4 v0, 0x0

    .line 32
    invoke-virtual {v5, v0}, Lz9/r;->G(Z)V

    .line 33
    .line 34
    .line 35
    new-instance v6, Lz9/i;

    .line 36
    .line 37
    invoke-direct {v6, v5, v3, v0}, Lz9/i;-><init>(Lz9/r;Lyb/c;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v3, v3, v6, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :pswitch_1
    sget-object v0, Lj9/b0;->a:Lj9/b0;

    .line 45
    .line 46
    new-instance v0, Lz9/i;

    .line 47
    .line 48
    invoke-direct {v0, v5, v3}, Lz9/i;-><init>(Lz9/r;Lyb/c;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4, v3, v3, v0, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
