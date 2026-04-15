.class public final Lvc/j;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lvc/k;


# direct methods
.method public synthetic constructor <init>(Lvc/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvc/j;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvc/j;->b:Lvc/k;

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
.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lvc/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lvc/o;->k:Lbe/c;

    .line 7
    .line 8
    iget-object v1, p0, Lvc/j;->b:Lvc/k;

    .line 9
    .line 10
    iget-object v1, v1, Lvc/k;->b:Lbe/e;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lbe/c;->a(Lbe/e;)Lbe/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget-object v0, Lvc/o;->k:Lbe/c;

    .line 18
    .line 19
    iget-object v1, p0, Lvc/j;->b:Lvc/k;

    .line 20
    .line 21
    iget-object v1, v1, Lvc/k;->a:Lbe/e;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lbe/c;->a(Lbe/e;)Lbe/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
