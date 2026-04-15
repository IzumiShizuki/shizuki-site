.class public final Lb0/r1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lf1/f;


# direct methods
.method public constructor <init>(Lf1/f;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lb0/r1;->b:I

    .line 1
    iput-object p1, p0, Lb0/r1;->c:Lf1/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lf1/f;II)V
    .locals 0

    .line 2
    iput p3, p0, Lb0/r1;->b:I

    iput-object p1, p0, Lb0/r1;->c:Lf1/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lb0/r1;->b:I

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
    const/4 p2, 0x6

    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object v0, p0, Lb0/r1;->c:Lf1/f;

    .line 36
    .line 37
    sget-object v1, Ly/p0;->a:Ly/p0;

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, p2}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 44
    .line 45
    .line 46
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x7

    .line 57
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    iget-object v0, p0, Lb0/r1;->c:Lf1/f;

    .line 62
    .line 63
    invoke-static {v0, p1, p2}, Lq/t1;->b(Lf1/f;Lx0/o;I)V

    .line 64
    .line 65
    .line 66
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_1
    check-cast p1, Lx0/o;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    const/4 p2, 0x7

    .line 77
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iget-object v0, p0, Lb0/r1;->c:Lf1/f;

    .line 82
    .line 83
    invoke-static {v0, p1, p2}, Lg2/n1;->a(Lf1/f;Lx0/o;I)V

    .line 84
    .line 85
    .line 86
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_2
    check-cast p1, Lx0/o;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    const/4 p2, 0x7

    .line 97
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    iget-object v0, p0, Lb0/r1;->c:Lf1/f;

    .line 102
    .line 103
    invoke-static {v0, p1, p2}, La/a;->o(Lf1/f;Lx0/o;I)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_3
    check-cast p1, Lx0/o;

    .line 110
    .line 111
    check-cast p2, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    const/4 p2, 0x7

    .line 117
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object v0, p0, Lb0/r1;->c:Lf1/f;

    .line 122
    .line 123
    invoke-static {v0, p1, p2}, Lb0/g0;->c(Lf1/f;Lx0/o;I)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
