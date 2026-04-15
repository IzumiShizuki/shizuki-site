.class public final synthetic Lk9/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp4/b;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lc7/e1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lk9/a;->a:I

    iput-object p1, p0, Lk9/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk9/a;->b:Lp4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls4/i;[B)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lk9/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/a;->b:Lp4/b;

    iput-object p2, p0, Lk9/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lk9/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk9/a;->b:Lp4/b;

    .line 7
    .line 8
    check-cast v0, Ls4/i;

    .line 9
    .line 10
    iget-object v1, p0, Lk9/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, [B

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    iget v0, v0, Ls4/i;->b:I

    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lnd/h;->f([BII)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lk9/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/net/Uri;

    .line 25
    .line 26
    iget-object v1, p0, Lk9/a;->b:Lp4/b;

    .line 27
    .line 28
    check-cast v1, Lc7/e1;

    .line 29
    .line 30
    new-instance v2, Lba/u0;

    .line 31
    .line 32
    const/16 v3, 0x1a

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, v0, v1, v4, v3}, Lba/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lyb/i;->a:Lyb/i;

    .line 39
    .line 40
    invoke-static {v0, v2}, Lhf/a0;->C(Lyb/h;Lic/n;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/graphics/Bitmap;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_1
    iget-object v0, p0, Lk9/a;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, [B

    .line 50
    .line 51
    iget-object v1, p0, Lk9/a;->b:Lp4/b;

    .line 52
    .line 53
    check-cast v1, Lc7/e1;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    array-length v3, v0

    .line 57
    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, v1, Lc7/e1;->d:Ljava/lang/Object;

    .line 62
    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
