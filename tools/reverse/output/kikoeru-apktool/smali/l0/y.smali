.class public final Ll0/y;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ll0/s0;

.field public final synthetic d:Ll0/a1;

.field public final synthetic e:Lf1/f;


# direct methods
.method public constructor <init>(Ll0/a1;Lf1/f;Ll0/s0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll0/y;->b:I

    .line 2
    iput-object p1, p0, Ll0/y;->d:Ll0/a1;

    iput-object p2, p0, Ll0/y;->e:Lf1/f;

    iput-object p3, p0, Ll0/y;->c:Ll0/s0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ll0/s0;Ll0/a1;Lf1/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll0/y;->b:I

    .line 1
    iput-object p1, p0, Ll0/y;->c:Ll0/s0;

    iput-object p2, p0, Ll0/y;->d:Ll0/a1;

    iput-object p3, p0, Ll0/y;->e:Lf1/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ll0/y;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    new-instance p2, Ll0/y;

    .line 31
    .line 32
    iget-object v0, p0, Ll0/y;->d:Ll0/a1;

    .line 33
    .line 34
    iget-object v1, p0, Ll0/y;->e:Lf1/f;

    .line 35
    .line 36
    iget-object v2, p0, Ll0/y;->c:Ll0/s0;

    .line 37
    .line 38
    invoke-direct {p2, v0, v1, v2}, Ll0/y;-><init>(Ll0/a1;Lf1/f;Ll0/s0;)V

    .line 39
    .line 40
    .line 41
    const v0, 0x2267854a

    .line 42
    .line 43
    .line 44
    invoke-static {v0, p2, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/16 v0, 0x30

    .line 49
    .line 50
    invoke-static {v2, p2, p1, v0}, Lh0/q0;->c(Ll0/s0;Lf1/f;Lx0/o;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    and-int/lit8 v0, p2, 0x3

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    const/4 v2, 0x1

    .line 72
    if-eq v0, v1, :cond_2

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 v0, 0x0

    .line 77
    :goto_2
    and-int/2addr p2, v2

    .line 78
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    sget-object p2, Ll0/b1;->a:Lx0/z;

    .line 85
    .line 86
    iget-object v0, p0, Ll0/y;->d:Ll0/a1;

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    new-instance v0, Lh0/o;

    .line 93
    .line 94
    iget-object v1, p0, Ll0/y;->e:Lf1/f;

    .line 95
    .line 96
    iget-object v2, p0, Ll0/y;->c:Ll0/s0;

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lh0/o;-><init>(Lf1/f;Ll0/s0;)V

    .line 99
    .line 100
    .line 101
    const v1, -0x103c35f6

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/16 v1, 0x38

    .line 109
    .line 110
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 115
    .line 116
    .line 117
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 118
    .line 119
    return-object p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 122
    .line 123
    .line 124
    .line 125
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
