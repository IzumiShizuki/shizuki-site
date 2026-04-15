.class public final synthetic Lba/r0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lba/r0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lba/r0;->b:Ljava/lang/String;

    iput-object p3, p0, Lba/r0;->c:Ljava/lang/String;

    iput p1, p0, Lba/r0;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput p2, p0, Lba/r0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/r0;->b:Ljava/lang/String;

    iput-object p4, p0, Lba/r0;->c:Ljava/lang/String;

    iput p3, p0, Lba/r0;->d:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lba/r0;->a:I

    .line 2
    .line 3
    check-cast p1, Lx0/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lba/r0;->d:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Lba/r0;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lba/r0;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1, p1, p2}, Lea/a;->c(Ljava/lang/String;Ljava/lang/String;Lx0/o;I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object v0, p0, Lba/r0;->b:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p0, Lba/r0;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget v2, p0, Lba/r0;->d:I

    .line 44
    .line 45
    invoke-static {v0, v1, p1, p2, v2}, Lba/z;->e(Ljava/lang/String;Ljava/lang/String;Lx0/o;II)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
