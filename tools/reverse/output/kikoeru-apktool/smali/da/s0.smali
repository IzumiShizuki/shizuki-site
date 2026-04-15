.class public final synthetic Lda/s0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lub/e;


# direct methods
.method public synthetic constructor <init>(ZLic/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lda/s0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lda/s0;->b:Z

    iput-object p2, p0, Lda/s0;->c:Lub/e;

    return-void
.end method

.method public synthetic constructor <init>(ZLub/e;II)V
    .locals 0

    .line 2
    iput p4, p0, Lda/s0;->a:I

    iput-boolean p1, p0, Lda/s0;->b:Z

    iput-object p2, p0, Lda/s0;->c:Lub/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lda/s0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/s0;->c:Lub/e;

    .line 7
    .line 8
    check-cast v0, Lic/n;

    .line 9
    .line 10
    check-cast p1, Lx0/o;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iget-boolean v1, p0, Lda/s0;->b:Z

    .line 23
    .line 24
    invoke-static {v1, v0, p1, p2}, Landroid/support/v4/media/session/b;->l(ZLic/n;Lx0/o;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    iget-object v0, p0, Lda/s0;->c:Lub/e;

    .line 31
    .line 32
    check-cast v0, Lic/a;

    .line 33
    .line 34
    check-cast p1, Lx0/o;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget-boolean v1, p0, Lda/s0;->b:Z

    .line 47
    .line 48
    invoke-static {v1, v0, p1, p2}, La2/c;->d(ZLic/a;Lx0/o;I)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_1
    iget-object v0, p0, Lda/s0;->c:Lub/e;

    .line 53
    .line 54
    check-cast v0, Lic/a;

    .line 55
    .line 56
    move-object v6, p1

    .line 57
    check-cast v6, Lx0/o;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    and-int/lit8 p2, p1, 0x3

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    const/4 v2, 0x1

    .line 69
    if-eq p2, v1, :cond_0

    .line 70
    .line 71
    const/4 p2, 0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/4 p2, 0x0

    .line 74
    :goto_1
    and-int/2addr p1, v2

    .line 75
    invoke-virtual {v6, p1, p2}, Lx0/o;->N(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-virtual {v6, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {v6}, Lx0/o;->K()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-nez p1, :cond_1

    .line 90
    .line 91
    sget-object p1, Lx0/k;->a:Lx0/r0;

    .line 92
    .line 93
    if-ne p2, p1, :cond_2

    .line 94
    .line 95
    :cond_1
    new-instance p2, Lda/z;

    .line 96
    .line 97
    const/4 p1, 0x1

    .line 98
    invoke-direct {p2, p1, v0}, Lda/z;-><init>(ILic/a;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, p2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    move-object v2, p2

    .line 105
    check-cast v2, Lic/k;

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/16 v8, 0x3c

    .line 109
    .line 110
    iget-boolean v1, p0, Lda/s0;->b:Z

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-static/range {v1 .. v8}, Lm0/z0;->a(ZLic/k;Lj1/q;ZLm0/p1;Lx0/o;II)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    invoke-virtual {v6}, Lx0/o;->Q()V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 123
    .line 124
    return-object p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
